import { BrowserModule } from '@angular/platform-browser';
import { NgModule} from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { EcFieldDetailsServiceService }  from './services/ec-field-details-service.service';
//import{EcAdminPostServiceService} from './services/ec-admin-post.service';
import { EcAdminPostComponent } from './ec-admin-post/ec-admin-post.component';
import { EcFieldDetailsComponent } from './ec-field-details/ec-field-details.component';
import { EcStreamAddComponent } from './ec-stream-add/ec-stream-add.component';
import { EcSubjectAddComponent } from './ec-subject-add/ec-subject-add.component';
import { EcFieldAddComponent } from './ec-field-add/ec-field-add.component';
import { EcHomeComponent } from './ec-home/ec-home.component';
import { EcHeaderComponent } from './ec-header/ec-header.component';
import { DisplayAllStreamsComponent } from './display-all-streams/display-all-streams.component';
import { EcFieldServiceService } from './services/ec-field-service.service';
import { EcFieldDisplayAllComponent } from './ec-field-display-all/ec-field-display-all.component';
import { EcAboutUsComponent } from './ec-about-us/ec-about-us.component';

import { EcFooterComponent } from './ec-footer/ec-footer.component';
import { EcAddBranchComponent } from './ec-add-branch/ec-add-branch.component';
import { EcUserLoginComponent } from './ec-user-login/ec-user-login.component';
import { EcShowAllNoticeComponent } from './ec-show-all-notice/ec-show-all-notice.component';
import { EcRegisterComponent } from './ec-register/ec-register.component';
import { EcAddExpertComponent } from './ec-add-expert/ec-add-expert.component';
import { EcAskQuestionComponent } from './ec-ask-question/ec-ask-question.component';
import { EcReplyQuestionComponent } from './ec-reply-question/ec-reply-question.component';
import { EcShowAllExpertComponent } from './ec-show-all-expert/ec-show-all-expert.component';
import { EcSingleStreamDetailsComponent } from './ec-single-stream-details/ec-single-stream-details.component';
import { FinalShowAllQuestionsComponent } from './final-show-all-questions/final-show-all-questions.component';
import { FinalQuestionUpdateComponent } from './final-question-update/final-question-update.component';



@NgModule({
  declarations: [
    AppComponent,
    EcHomeComponent,
    EcAdminPostComponent,
   EcFieldDetailsComponent,
   EcStreamAddComponent,
   EcAddBranchComponent,
   EcSubjectAddComponent,
   EcFieldAddComponent,
   EcFieldDisplayAllComponent,
   EcUserLoginComponent,
   EcShowAllNoticeComponent,
   EcRegisterComponent,
   EcHeaderComponent,
   DisplayAllStreamsComponent,
   EcAboutUsComponent,
   EcAddExpertComponent,
   EcAdminPostComponent,
   EcAskQuestionComponent,
   EcReplyQuestionComponent,
   EcShowAllExpertComponent,
  
   EcFooterComponent,
  
   EcSingleStreamDetailsComponent,
  
   FinalShowAllQuestionsComponent,
  
   FinalQuestionUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
  
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }