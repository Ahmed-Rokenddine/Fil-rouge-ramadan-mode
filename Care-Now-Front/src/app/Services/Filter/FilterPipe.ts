import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {
  transform(items: any[], searchText: string): any[] {
    if (!items) {
      return [];
    }
    if (!searchText) {
      return items;
    }
    searchText = searchText.toLowerCase();
    return items.filter(item => {
      if (item.nom && item.adresse) {
        // Check if item is a hospital
        return item.nom.toLowerCase().includes(searchText) || item.adresse.toLowerCase().includes(searchText);
      } else if (item.nom && item.specialite) {
        // Check if item is a doctor
        return item.nom.toLowerCase().includes(searchText) || item.specialite.toLowerCase().includes(searchText);
      }
      return false;
    });
  }
}
