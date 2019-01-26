import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';
import { NoticeServiceService } from '../services/notice-service.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-ec-add-notice',
  templateUrl: './ec-add-notice.component.html',
  styleUrls: ['./ec-add-notice.component.css']
})
export class EcAddNotice implements OnInit {

  constructor(public rest: NoticeServiceService, private route: ActivatedRoute, private router: Router) { }
//finalObj:{relatedAreaOfNotice:'relatedAreaOfNotice',heading:'heading',content:'content',link:'link'};
  form;
  array1=[
   { name:'field1'},
   { name:'field2'},
   { name:'field3'},
   { name:'field4'},
   { name:'field5'}
  ];

  ngOnInit() {

    this.form = new FormGroup({
      
      
      relatedAreaOfNotice : new FormControl(''),
      heading :new FormControl(''),
    
      content: new FormControl(''),
      link: new FormControl(''),
   
    });
  }

  onSubmit(noticeObj){
    /*
    this.finalObj.relatedAreaOfNotice=this.form.value.relatedAreaOfNotice;
    this.finalObj.link=this.form.value.link;
    this.finalObj.heading=this.form.value.heading;
    this.finalObj.content=this.form.value.content;*/
    console.log(noticeObj);
    this.rest.addnotice(noticeObj).subscribe((result) => {
      console.log(result);
     }, (err) => {
       console.log(err);
    }
    );
  }


  // private int noticeId;
	// private String  relatedAreaOfNotice;
	// private String heading;
	// private String content;
	// private String link;
	// private Date date;

  

}




