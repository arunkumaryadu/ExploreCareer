import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { EcConfig } from './Config';

@Injectable({
  providedIn: 'root'
})
export class NoticeServiceService {
  getAllNotice(): any {
    throw new Error("Method not implemented.");
  }

constructor(private http: HttpClient) { }
endpoint = EcConfig.BaseIp;

httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

private extractData(res: Response) {
  let body = res;
  return body || { };
}

addnotice (noticeadded): Observable<any> {
  console.log(noticeadded);
    return this.http.post<any>(this.endpoint + 'notice/add', JSON.stringify(noticeadded), this.httpOptions).pipe(
      tap((loginuser) => console.log(`added Subject w/ id=${loginuser.name}`)),
      catchError(this.handleError<any>('addnotice'))
    );
}


public showNotice() {
  return this.http.post<Array<any>>(this.endpoint+ 'notice/getAllNotice', {responseType : 'json'});
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
