import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../services/question.service';
import { FinalShowAllQuestionsComponent } from '../final-show-all-questions/final-show-all-questions.component';
import{ActivatedRoute,Router} from '@angular/router';

@Component({
  selector: 'app-final-question-update',
  templateUrl: './final-question-update.component.html',
  styleUrls: ['./final-question-update.component.css']
})
export class FinalQuestionUpdateComponent implements OnInit {
  questions:any=[];
  constructor(public rest:QuestionService,public allquestion:FinalShowAllQuestionsComponent,public route:ActivatedRoute) { 
    this.getAllQues();
    const id = +this.route.snapshot.paramMap.get('id');
   
  }

  ngOnInit() {
  }

  getAllQues() {
   
    this.rest.getData().subscribe((data: {}) => {
     console.log(data);
      this.questions = data;
    });
}
}
