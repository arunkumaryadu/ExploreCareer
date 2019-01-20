import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-ec-add-expert',
  templateUrl: './ec-add-expert.component.html',
  styleUrls: ['./ec-add-expert.component.css']
})
export class EcAddExpertComponent implements OnInit {

  formdata;
  constructor() { }

  ngOnInit() { 
    this.formdata=new FormGroup(
    {
      inputEmail4:new FormControl(''),
      inputPassword4:new FormControl(''),
      inputemail:new FormControl(''),
      inputContact:new FormControl(''),
      inputState:new FormControl('')
    }
  );
  }
  onSubmit(mediaItem){
    console.log(mediaItem);
}
}
