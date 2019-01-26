import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { EcConfig } from 'src/app/services/Config';

@Injectable({
  providedIn: 'root'
})
export class UserLoginService {
  userObj={userName:null,emailId:null,passWord:null,phoneNumber:null,standard:null,TypeOfUser:null};


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


ulogin (loginuser): Observable<any> {
console.log(loginuser);
  return this.http.post<any>(this.endpoint + 'user/login', JSON.stringify(loginuser), this.httpOptions).pipe(
    tap((loginuser) => console.log(`user logged in w/ id=${loginuser.name}`)),
    catchError(this.handleError<any>('ulogin'))
  );
}

uregister (registeruser): Observable<any> {
  console.log(registeruser);
  this.userObj.userName=registeruser.userName;
  this.userObj.emailId=registeruser.emailId;
  this.userObj.passWord=registeruser.passWord;
  this.userObj.phoneNumber=registeruser.phoneNumber;
  this.userObj.standard=registeruser.standard;
  this.userObj.TypeOfUser="User";
    return this.http.post<any>(this.endpoint + 'user/add', JSON.stringify(this.userObj), this.httpOptions).pipe(
      tap((registeruser) => console.log(`user registered w/ id=${registeruser.name}`)),
      catchError(this.handleError<any>('uregister'))
    );
 }


//  passwordchange (changepassword): Observable<any> {
//   console.log(changepassword);
//     return this.http.post<any>(this.endpoint + '/add', JSON.stringify(changepassword), this.httpOptions).pipe(
//       tap((changepassword) => console.log(`password changed`)),
//       catchError(this.handleError<any>('passwordchange'))
//     );
//  }

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