import { Component, OnInit } from '@angular/core';
import { NoticeServiceService } from '../services/notice-service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-ec-show-all-notice',
  templateUrl: './ec-show-all-notice.component.html',
  styleUrls: ['./ec-show-all-notice.component.css']
})
export class EcShowAllNoticeComponent implements OnInit {
  notices:any=[];

  constructor(public rest:NoticeServiceService, private route: ActivatedRoute, private router: Router) { 
    this.showNotice();}
  ngOnInit() {
  }

  showNotice() {
   
    this.rest.showNotice().subscribe((data: {}) => {
     console.log(data);
      this.notices = data;
    });

}
}



