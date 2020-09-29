package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
)

func main() {
	var f [3]string
	f[0] = "Fabiola"
	f[1] = "Naranjo"
	f[2] = "Sierra"
	var b [3]string

	file, err := os.Open("C:/Users/Fabiola/Desktop/Ordenartxt/Python/datos.txt")
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()
	scanner := bufio.NewScanner(file)
	var cont = 0
	fmt.Println("Desordenada")
	for scanner.Scan() {

		fmt.Println(scanner.Text())
		b[cont] = scanner.Text()
		cont++

	}
	var cadenaCorrecta [3]string

	for i := 0; i < 3; i++ {
		for j := 0; j < 3; j++ {
			if f[i] == b[j] {
				cadenaCorrecta[i] = f[i]
			}
		}
	}
	fmt.Println("Ordenada")
	for x := 0; x < 3; x++ {
		fmt.Println(cadenaCorrecta[x])
	}
}
