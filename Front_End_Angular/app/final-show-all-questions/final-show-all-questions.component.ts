import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../services/question.service';

@Component({
  selector: 'app-final-show-all-questions',
  templateUrl: './final-show-all-questions.component.html',
  styleUrls: ['./final-show-all-questions.component.css']
})
export class FinalShowAllQuestionsComponent implements OnInit {
  questions:any=[];
  constructor(public rest:QuestionService) { this.getAllQues();}

  ngOnInit() {
  }
  getAllQues() {
   
    this.rest.getData().subscribe((data: {}) => {
     console.log(data);
      this.questions = data;
    });
  }
    getQuestions(){
      return this.questions;
    }
}


  


