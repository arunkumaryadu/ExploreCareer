import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import{QuestionService} from  '../services/Question.service'
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
@Component({
  selector: 'app-ec-ask-question',
  templateUrl: './ec-ask-question.component.html',
  styleUrls: ['./ec-ask-question.component.css']
})
export class EcAskQuestionComponent implements OnInit {
formdata;
todaydate;
constructor(public rest:QuestionService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.formdata=new FormGroup(
      {
        relatedAreaOfQuestion:new FormControl(''),
        question:new FormControl('')
      }
    );
  }

  onSubmit(askQ){
    console.log(askQ);
    this.rest.EnterQuestion(askQ).subscribe((result) => {
          console.log(result);
        }, (err) => {
              // console.log(err);
               
    });
}
}



/*export class AppComponent {
   title = 'Angular 6 Project!';
   todaydate;
   componentproperty;
   constructor(private myservice: MyserviceService) { }
   ngOnInit() {
      this.todaydate = this.myservice.showTodayDate();
   }
   onClickSubmit(data) {
      alert("Entered Email id : " + data.emailid);
   }
} */