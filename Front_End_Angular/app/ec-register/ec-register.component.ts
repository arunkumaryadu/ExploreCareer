import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl ,Validators} from '@angular/forms';
import { UserLoginService } from '../services/user-login.service';
import { ActivatedRoute, Router } from '@angular/router';
import { PasswordValidation } from './PasswordValidation';



@Component({
  selector: 'app-ec-register',
  templateUrl: './ec-register.component.html',
  styleUrls: ['./ec-register.component.css']
})
export class EcRegisterComponent implements OnInit {

  constructor(public rest:UserLoginService, private route: ActivatedRoute, private router: Router) { }

  form;

  ngOnInit() {

    this.form = new FormGroup({
      
      //stream: new FormControl('')
      userName : new FormControl('', Validators.required),
      emailId :new FormControl('', Validators.required),
      phoneNumber : new FormControl(''),
      standard: new FormControl(''),
     passWord: new FormControl('', Validators.required),
     password2: new FormControl('', Validators.required)
    })
  }

  onSubmit(registeruser){
    console.log(registeruser);
    this.rest.uregister(registeruser).subscribe((result) => {
      console.log(result);
     }, (err) => {
       console.log(err);
    }
    );
  } 

}




