import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap } from 'rxjs/operators';
import { catchError } from 'rxjs/internal/operators/catchError';
import { EcConfig } from 'src/app/services/Config';



@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  questionObj={
    relatedAreaOfQuestion:null,
    askerEmail:"arun@g.c",
    question:null,
    askerName:"ujjwal"
  };

  AnswerObj={answer:null,
    hiddenId:null};

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




public getData() {       // To fetch data from server 
  return this.http.post<Array<any>>(this.endpoint+ '/question/unansweredQuestion', {responseType : 'json'});
}



// replyQues(askQ):Observable<any>{            //ReplyQuestion  
// console.log(askQ);
// this.AnswerObj.answer=askQ.relatedAreaOfQuestion;
// this.AnswerObj.hiddenId=;
// this.questionObj.question=askQ.question;
// // this.questionObj.replierEmail="ujjwal@11.a";
// this.questionObj.askerName="ujjwal";
// // this.questionObj.answer="This answer should be taken from database";
// console.log(this.questionObj);
// return this.http.post<any>(this.endpoint + '/question/add', JSON.stringify(this.questionObj), this.httpOptions).pipe(
//         tap((questionObj) => console.log(`added Question w/ id=${askQ.question}`)),
//         catchError(this.handleError<any>('EnterQuestion'))
//       );
// }

replyQues (sub): Observable<any> {
  console.log(sub);
    return this.http.post<any>(this.endpoint + '/question/update', JSON.stringify(sub), this.httpOptions).pipe(
      tap((sub) => console.log(`added Subject w/ id=${sub.answer}`)),
      catchError(this.handleError<any>('addSubject'))
    );
  }



EnterQuestion(askQ):Observable<any>{            //AskQuestion  
    //enter question using form 
    //console.log(this.endpoint);
    console.log(askQ);
  this.questionObj.relatedAreaOfQuestion=askQ.relatedAreaOfQuestion;
  this.questionObj.askerEmail="arun@g.c";
  this.questionObj.question=askQ.question;
 // this.questionObj.replierEmail="ujjwal@11.a";
  this.questionObj.askerName="ujjwal";
 // this.questionObj.answer="This answer should be taken from database";
 console.log(this.questionObj);
  return this.http.post<any>(this.endpoint + '/question/add', JSON.stringify(this.questionObj), this.httpOptions).pipe(
          tap((questionObj) => console.log(`added Question w/ id=${askQ.question}`)),
          catchError(this.handleError<any>('EnterQuestion'))
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
