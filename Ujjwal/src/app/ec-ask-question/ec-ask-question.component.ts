import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-ec-ask-question',
  templateUrl: './ec-ask-question.component.html',
  styleUrls: ['./ec-ask-question.component.css']
})
export class EcAskQuestionComponent implements OnInit {
formdata;
  constructor() { }

  ngOnInit() {
    this.formdata=new FormGroup(
      {
        selectStream:new FormControl(''),
        QuestionArea:new FormControl('')
      }
    );
  }
  onSubmit(mediaItem){
    console.log(mediaItem);
    }
}
