import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UserLoginService } from '../services/user-login.service';



@Component({
  selector: 'app-ec-user-login',
  templateUrl: './ec-user-login.component.html',
  styleUrls: ['./ec-user-login.component.css']
})
export class EcUserLoginComponent implements OnInit {

  constructor(public rest:UserLoginService, private route: ActivatedRoute, private router: Router) { }

  form;
 

  ngOnInit() {

    this.form = new FormGroup({
      emailId :new FormControl(''),
      passWord: new FormControl(''),
     
    });
  }

  onSubmit(loginuser){
    console.log(loginuser);
    
    this.rest.ulogin(loginuser).subscribe((result) => {
      console.log(result);
     }, (err) => {
       console.log(err);
    }
  );
}

    

}
