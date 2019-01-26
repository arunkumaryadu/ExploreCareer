import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../services/question.service';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import { FormGroup } from '@angular/forms';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-ec-reply-question',
  templateUrl: './ec-reply-question.component.html',
  styleUrls: ['./ec-reply-question.component.css']
})
export class EcReplyQuestionComponent implements OnInit {

 
  formdata: any;
  questions:any=[];
constructor(public rest:QuestionService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getAllQues();
    this.formdata=new FormGroup(
      {
        answer:new FormControl(''),
        id:new FormControl('')
      }
    );
  }
  onSubmit(askQ){
    console.log(askQ);
    this.rest.replyQues(askQ).subscribe((result) => {
          console.log(result);
        }, (err) => {
              // console.log(err);
               
    });
}
    
  

  getAllQues() {
   
    this.rest.getData().subscribe((data: {}) => {
     console.log(data);
      this.questions = data;
    });
}
}
