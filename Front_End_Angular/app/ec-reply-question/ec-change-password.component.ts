// import { Component, OnInit } from '@angular/core';
// import { UserLoginService } from '../services/user-login.service';
// import { ActivatedRoute } from '@angular/router';
// import { Router } from '@angular/router';
// import { FormGroup } from '@angular/forms';
// import { FormControl } from '@angular/forms';

// @Component({
//   selector: 'app-ec-change-password',
//   templateUrl: './ec-change-password.component.html',
//   styleUrls: ['./ec-change-password.component.css']
// })
// export class EcChangePasswordComponent implements OnInit {
//   formdata;
//   cha
//   constructor(public rest:UserLoginService, private route: ActivatedRoute, private router: Router) { }


//   ngOnInit() {
//     this.formdata=new FormGroup(
//       {
//         EmailId:new FormControl(''),
//         OldPassword:new FormControl(''),
//         NewPassword:new FormControl('')
//       }
//     );
//   }
//   onSubmit(changepassword){
//     console.log(changepassword);
//     this.rest.passwordchange(changepassword).subscribe((result) => {
//           console.log(result.status);

//           if (result.status==1){
//             this.rest.passwordchange1(changepassword).subscribe((result) => {
//               console.log(result.status);
            

//         }, (err) => {
//                console.log(err);

             
//     });
// }
// });
//   }
// }