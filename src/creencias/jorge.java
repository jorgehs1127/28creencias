package creencias;
public class jorge {
    int ordenar [] = new int [28];
    String ord []= new String [28];
    {
    ord[0]="1. Las Sagradas Escrituras  ";
    ord[1]=" 2. La Trinidad";
    ord[2]=" 3. Dios Padre";
    ord[3]=" 4. Dios Hijo";
    ord[4]=" 5. Dios Espíritu Santo";
    ord[5]=" 6. Dios es el Creador";
    ord[6]=" 7. La Naturaleza del Hombre";
    ord[7]=" 8. El Gran Conflicto";
    ord[8]=" 9. Vida, Muerte y Ressurrección de Cristo";
    ord[9]=" 10. La Experiencia de la Salvación";
    ord[10]=" 11. El crecimiento en Cristo";
    ord[11]=" 12. La Iglesia";
    ord[12]=" 13. El Remaneciente y su Misión";
    ord[13]=" 14. Unidad en el Cuerpo de Cristo";
    ord[14]=" 15. El Bautismo";
    ord[14]=" 16. La Cena del Señor";
    ord[16]=" 17. Dones y Ministerios Espirituales";
    ord[17]=" 18. El Don de Profecía";
    ord[18]=" 19. La Ley de Dios";
    ord[19]=" 20. El Sábado";
    ord[20]=" 21. Mayordomía";
    ord[21]=" 22. Conducta Cristiana";
    ord[22]=" 23. Matrimonio y Familia";
    ord[23]=" 24. El Ministerio de Cristo en el Santuario Celestial";
    ord[24]=" 25. La Segunda Venida de Cristo";
    ord[25]=" 26. Muerte y Resurrección";
    ord[26]=" 27. El Milenio y el Fin del Pecado";
    ord[27]=" 28. La Nueva Tierra";
    }
    
    {
    ordenar[0]=1;
    ordenar[1]= 2;
    ordenar[2]= 3;
    ordenar[3]= 4;
    ordenar[4]= 5;
    ordenar[5]= 6;
    ordenar[6]= 7;
    ordenar[7]=8;
    ordenar[8]=9;
    ordenar[9]=10;
    ordenar[10]= 11;
    ordenar[11]=12;
    ordenar[12]=13;
    ordenar[13]=14;
    ordenar[14]=15;
    ordenar[14]=16;
    ordenar[16]=17;
    ordenar[17]=18;
    ordenar[18]=19;
    ordenar[19]=20;
    ordenar[20]=21;
    ordenar[21]=22;
    ordenar[22]=23;
    ordenar[23]=24;
    ordenar[24]=25;
    ordenar[25]=26;
    ordenar[26]=27;
    ordenar[27]=28;
    }
    
    String horta(int i)
    {
        for (int j = 0; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                if(ordenar[j] > ordenar[k])
                {
                    int num;
                    num = ordenar[j];
                    ordenar[j] = ordenar[k];
                    ordenar[k]= num;
                    
                    String orde;
                    orde = ord[j];
                    ord[j] = ord[k];
                    ord[k]= orde;
                }
            }
        }
        return ord[i];
    }
    
    String desordenar(int i)
    {
        for (int j = 0; j < 13; j++) {
            for (int k = j+1; k < 14; k++) {
                if( ordenar[j] <  ordenar[k])
                {
                    int num;
                    num =  ordenar[j];
                     ordenar[j] =  ordenar[k];
                     ordenar[k]= num;
                    
                    String orde;
                    orde = ord[j];
                    ord[j] = ord[k];
                    ord[k]= orde;
                }
            }
        }
        
        for (int j = 15; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                if(ordenar[j] < ordenar[k])
                {
                    int num;
                    num = ordenar[j];
                    ordenar[j] = ordenar[k];
                    ordenar[k]= num;
                   String orde;
                    orde = ord[j];
                    ord[j] = ord[k];
                    ord[k]= orde;
                }
            }
        }
        return ord[i];
    }
}
    

