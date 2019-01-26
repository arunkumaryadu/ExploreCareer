import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap } from 'rxjs/operators';
import { catchError } from 'rxjs/internal/operators/catchError';


@Injectable({
  providedIn: 'root'
})
export class ExpertService {

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


public getData() {
  return this.http.get<Array<any>>(this.endpoint+ 'user/getAllUsers', {responseType : 'json'});
}

addExpert(ExpertDetail):Observable<any>{
    console.log(ExpertDetail);
    return this.http.post<any>(this.endpoint + '/add', JSON.stringify(ExpertDetail), this.httpOptions).pipe(
            tap((sub) => console.log(`added Expert w/ id=${ExpertDetail.userName}`)),
            catchError(this.handleError<any>('addExpert'))
          );
}





// addSubject (sub): Observable<any> {
//   console.log(sub);
//     return this.http.post<any>(this.endpoint + '/add', JSON.stringify(sub), this.httpOptions).pipe(
//       tap((sub) => console.log(`added Subject w/ id=${sub.name}`)),
//       catchError(this.handleError<any>('addSubject'))
//     );
//   }


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
