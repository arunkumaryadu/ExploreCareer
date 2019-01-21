import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {


  constructor(private http: HttpClient) { }
endpoint = 'http://localhost:7080/exploreyourcareer/subject';

 httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

private extractData(res: Response) {
  let body = res;
  return body || { };
}


addSubject (sub): Observable<any> {
console.log(sub);
  return this.http.post<any>(this.endpoint + '/add', JSON.stringify(sub), this.httpOptions).pipe(
    tap((sub) => console.log(`added Subject w/ id=${sub.name}`)),
    catchError(this.handleError<any>('addSubject'))
  );
}


private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {

    // TODO: send the error to remote logging infrastructure
    console.error(error); // log to console instead

    // TODO: better job of transforming error for user consumption
    console.log(`${operation} failed: ${error.message}`);

    // Let the app keep running by returning an empty result.
    return of(result as T);
  };
}
}
