cadenaordenada = ["Fabiola", "Naranjo", "Sierra"]
cadenadescompuesta = [ ]
cadenafinal = [ ]

archivo = open('C:/Users/Fabiola/Desktop/Ordenartxt/Python/datos.txt', 'r')

for linea in archivo.readlines():
    cadenadescompuesta.append(linea)

for item1 in cadenaordenada:
    for item2 in cadenadescompuesta:
        if item1 in item2:
            cadenafinal.append(item1)
print("Cadena Ordenada")
print(cadenafinal)
