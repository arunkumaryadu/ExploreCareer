import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FieldService {

  constructor(private http: HttpClient) { }
endpoint = 'http://192.168.43.54:7080/exploreyourcareer/';

 httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

private extractData(res: Response) {
  let body = res;
  return body || { };
}
public getBranch() {
  return this.http.get<Array<any>>(this.endpoint+ 'branch/getAllBranch', {responseType : 'json'});
}

addField (field): Observable<any> {
  console.log("final obj is");
  
console.log(field);
  return this.http.post<any>(this.endpoint + 'field/add', JSON.stringify(field), this.httpOptions).pipe(
    tap((sub) => console.log(`added Field w/ name=${field.name}`)),
    catchError(this.handleError<any>('addField'))
  );
}
getFields(): Observable<any> {
  return this.http.get(this.endpoint + 'field/login').pipe(
    map(this.extractData));
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