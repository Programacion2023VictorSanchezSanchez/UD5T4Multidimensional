## Tarea 4 Matrices
### Ejercicio 1
a: gradeTable[5][3] = 0;

b: int[][] gradeTable = { {99, 42, 74, 83, 100},

                         {90, 91, 72, 88, 95},
                         
                         {88, 61, 74, 89, 96},
                         
                         {61, 89, 82, 98, 93},
                         
                         {93, 73, 75, 78, 99},
                         
                         {50, 65, 92, 87, 94},
                         
                         {43, 98, 78, 56, 99}};

c:

  i: suma +1 a [3] [4]

  ii: value = a 40 || 78 + 2 = 80 / 2 = 40

  iii: Da error

  iv: Da error

  v: asigna [2] [2] = 4

### Ejercicio 2
a: Sería valor 4

### Ejercicio 3
a: Primero muestra 4, segundo 2, tercero da error y cuarto también da error.

b: 3, porque da la longitud de las filas que contiene.

c: Fila 1: 3, Fila 2: 2, Fila 3: 5. Podemos averiguar la longitud de las filas(o numero de columnas) con miArray[fila].lenght

d: int [] [] pruebaArray = {{1, 2, 3},

                            {4, 5, 6, 7, 8, 9},

                            {2, 3, 4}};

  int temp [] = {5, 6, 7, 8, 8, 2};

  int i = 0;

  pruebaArray[i++] = temp;

  temp[3] = 9999;

e: for (int i=0;i<array.length;i++){//total filas

    for(int j=0;j<array[0].length;j++){//total columnas
    
        System.out.println(array[i][j]);

### Ejercicio 4
int [] [] matriz = new int[5][10];

### Ejercicio 5
for (int i=0;i<array.length;i++){//total filas

    for(int j=0;j<array[0].length;j++){//total columnas
    
        array[i][j] = array[i][j] * 2;


### Ejercicio 6
for (int i = 0 ; i < pruebaArray.length ; i++){

  if(pruebaArray[i] == null){

    System.out.println("Fila nula");

}else{
  
  for(int num : pruebaArray[i]){

    System.out.print(num+" ");

    }

    System.out.println("");
    
}
