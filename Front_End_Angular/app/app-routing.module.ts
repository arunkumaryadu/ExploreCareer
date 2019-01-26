// inbuild
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

// my component

import { EcHomeComponent }      from './ec-home/ec-home.component';
import {EcSubjectAddComponent} from './ec-subject-add/ec-subject-add.component';
import { EcStreamAddComponent } from './ec-stream-add/ec-stream-add.component';
import { EcFieldAddComponent } from './ec-field-add/ec-field-add.component';
import { DisplayAllStreamsComponent } from './display-all-streams/display-all-streams.component';
import { EcFieldDisplayAllComponent } from './ec-field-display-all/ec-field-display-all.component';
import { EcAboutUsComponent } from './ec-about-us/ec-about-us.component';
import { EcFooterComponent } from './ec-footer/ec-footer.component';
import { EcAddBranchComponent } from './ec-add-branch/ec-add-branch.component';
import { EcUserLoginComponent } from './ec-user-login/ec-user-login.component';
import { EcShowAllNoticeComponent } from './ec-show-all-notice/ec-show-all-notice.component';
import { EcRegisterComponent } from './ec-register/ec-register.component';
import { EcShowAllExpertComponent } from './ec-show-all-expert/ec-show-all-expert.component';
import { EcReplyQuestionComponent } from './ec-reply-question/ec-reply-question.component';
import { EcAskQuestionComponent } from './ec-ask-question/ec-ask-question.component';
import { EcSingleStreamDetailsComponent } from 'src/app/ec-single-stream-details/ec-single-stream-details.component';
import { FinalShowAllQuestionsComponent } from './final-show-all-questions/final-show-all-questions.component';
import { FinalQuestionUpdateComponent } from './final-question-update/final-question-update.component';


const routes: Routes = [
  { path: '', redirectTo: '/Home', pathMatch: 'full' },
  { path: 'Home', component: EcHomeComponent },
 { path: 'SubjectAdd',component: EcSubjectAddComponent },
 { path: 'StreamAdd',component: EcStreamAddComponent },
 { path: 'DisplayStream',component: DisplayAllStreamsComponent },
 { path: 'FieldAdd',component: EcFieldAddComponent },
 { path: 'CareerIn',component: EcFieldDisplayAllComponent},
 { path: 'AboutUs',component: EcAboutUsComponent},
 { path: 'BranchAdd',component: EcAddBranchComponent},
 { path: 'UserLogin',component: EcUserLoginComponent},
 { path: 'ShowNotice',component: EcShowAllNoticeComponent},
 { path: 'AddNotice',component: EcFieldAddComponent},
 { path: 'UserRegister',component: EcRegisterComponent},
 { path: 'ShowExpert',component: EcShowAllExpertComponent},
 { path: 'ReplyQuestion',component: EcReplyQuestionComponent},
 { path: 'AskQuestion',component: EcAskQuestionComponent},
 { path: 'detail/:id', component: EcSingleStreamDetailsComponent },
 { path: 'ShowQuestions', component: FinalShowAllQuestionsComponent },
 { path: 'UpdateQuestions/:id', component: FinalQuestionUpdateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
