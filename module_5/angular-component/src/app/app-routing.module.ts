import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {YoutubePlaylistComponent} from "./youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./youtube-player/youtube-player.component";
import {ProductListComponent} from "./product-management/product/product-list/product-list.component";
import {ProductCreateComponent} from "./product-management/product/product-create/product-create.component";
import {TimelinesComponent} from "./time-live/timelines/timelines.component";
import {DictionaryPageComponent} from "./dictionary/dictionary-page/dictionary-page.component";
import {DictionaryTranslateComponent} from "./dictionary/dictionary-translate/dictionary-translate.component";
import {ProductEditComponent} from "./product-management/product-edit/product-edit.component";
import {ProductDeleteComponent} from "./product-management/product-delete/product-delete.component";


const routes: Routes = [
  {
    path: 'timelines',
    component: TimelinesComponent

  },
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {
    path: 'product/list',
    component: ProductListComponent
  },
   {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/update/:id',
    component: ProductEditComponent
  },
  {
    path: 'product/delete/:id',
    component: ProductDeleteComponent
  },
  {
    path:'dictionary',component:DictionaryPageComponent
  },
  {
    path:'dictionary-translate/:key',component:DictionaryTranslateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
