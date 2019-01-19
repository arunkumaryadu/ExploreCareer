import { Component, OnInit } from '@angular/core';
import{FormGroup,FormControl} from '@angular/forms'

@Component({
  selector: 'app-ec-home',
  templateUrl: './ec-home.component.html',
  styleUrls: ['./ec-home.component.css']
})
export class EcHomeComponent implements OnInit {

  constructor() { }

  form;

  ngOnInit(){
  this.form = new FormGroup({
  class: new FormControl(''),
  stream: new FormControl('')});

  }


  onSubmit(mediaItem){
  console.log(mediaItem);
  }

}
