import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { EcConfig } from 'src/app/services/Config';

@Injectable({
  providedIn: 'root'
})
export class StreamService {

  constructor(private http: HttpClient) { }
endpoint = EcConfig.BaseIp;

 httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};
public getData() {
  return this.http.get<Array<any>>(this.endpoint+ 'stream/getAllStream', {responseType : 'json'});
}
private extractData(res: Response) {
  let body = res;
  return body || { };
}


addStream (sub): Observable<any> {
console.log(sub);
  return this.http.post<any>(this.endpoint + 'stream/add', JSON.stringify(sub), this.httpOptions).pipe(
    tap((sub) => console.log(`added Stream w/ name=${sub.name}`)),
    catchError(this.handleError<any>('addSubject'))
  );
}


private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {
    return of(result as T);
  };
}
}