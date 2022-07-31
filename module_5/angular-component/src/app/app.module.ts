import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { PetComponent } from './pet/pet.component';
import { AngularUsingBootstrapComponent } from './angular-using-bootstrap/angular-using-bootstrap.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ShowColorComponent } from './show-color/show-color.component';
import { ArticleComponent } from './article/article.component';
import { LikeComponent } from './like/like.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import { TodoComponent } from './bai-tap-ss9/todo/todo.component';
import { RegisterAccountUseReactiveComponent } from './register-account-use-reactive/register-account-use-reactive.component';

import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { ProductListComponent } from './product-management/product/product-list/product-list.component';
import { ProductCreateComponent } from './product-management/product/product-create/product-create.component';
import { TimelinesComponent } from './time-live/timelines/timelines.component';
import { DictionaryPageComponent } from './dictionary/dictionary-page/dictionary-page.component';
import { DictionaryTranslateComponent } from './dictionary/dictionary-translate/dictionary-translate.component';
import { ProductDeleteComponent } from './product-management/product-delete/product-delete.component';
import { ProductEditComponent } from './product-management/product-edit/product-edit.component';
import {SharedModule} from "./thuc-hanh-ss9/shared/shared.module";
import {HttpClientModule} from "@angular/common/http";

import { TodoEditComponent } from './bai-tap-ss9/todo-edit/todo-edit.component';
import { TodoDeleteComponent } from './bai-tap-ss9/todo-delete/todo-delete.component';
import {ImageGalleryModule} from "./thuc-hanh-gallery-DI/image-gallery/image-gallery.module";
import {GalleryConfig} from "./thuc-hanh-gallery-DI/image-gallery/token";


@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    PetComponent,
    AngularUsingBootstrapComponent,
    CalculatorComponent,
    ShowColorComponent,
    ArticleComponent,
    LikeComponent,
    FooterComponent,
    NavbarComponent,
    NameCardComponent,
    ProgressBarComponent,
    CountdownTimerComponent,
    RatingBarComponent,
    TodoComponent,
    RegisterAccountUseReactiveComponent,

    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    ProductListComponent,
    ProductCreateComponent,
    TimelinesComponent,
    DictionaryPageComponent,
    DictionaryTranslateComponent,
    ProductDeleteComponent,
    ProductEditComponent,

    TodoEditComponent,
    TodoDeleteComponent,

  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule,
      SharedModule,
      HttpClientModule,
      ImageGalleryModule
    ],
  providers: [
    {provide: GalleryConfig, useValue: 3}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
