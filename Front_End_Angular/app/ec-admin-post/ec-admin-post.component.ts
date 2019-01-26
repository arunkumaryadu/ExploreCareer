import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';

@Component({
    selector: 'app-ec-admin-post',
    templateUrl: './ec-admin-post.component.html',
    styleUrls: ['./ec-admin-post.component.css']
  })
export class EcAdminPostComponent implements OnInit {

  constructor() { }

  form;

  ngOnInit() {

    this.form = new FormGroup({
      class: new FormControl(''),
      //stream: new FormControl('')
      post : new FormControl('')
      
    });
  }

  onSubmit(mediaItem){
    console.log(mediaItem);
    }

  // 

}


