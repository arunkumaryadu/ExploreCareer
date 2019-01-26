import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BranchService {

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

addbranch (addedbranch): Observable<any> {
  console.log(addedbranch);
    return this.http.post<any>(this.endpoint + 'branch/add', JSON.stringify(addedbranch), this.httpOptions).pipe(
      tap((addedbranch) => console.log(`added Subject w/ id=${addedbranch.name}`)),
      catchError(this.handleError<any>('addbranch'))
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
