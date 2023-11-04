n_terms = int(input ("Seberapa banyak terms yang akan dimasukkan "))  
  
# Dua kondisi terms 
n_1 = 1  
n_2 = 1  
count = 0  
  
# Cek jika angka atau terms valid atau tidak
if n_terms <= 0:  
    print ("harap masukkan positive integer, angka yang anda masukkan salah")  
# Jika hanya ada satu  term, maka akan kembali ke n_1  
elif n_terms == 1:  
    print ("Perhitungan Fibonacci hingga angka", n_terms, "adalah : ")  
    print(n_1)  
# Jalankan perhitungan Fibonacci pada angka yang dimasukkan 
else:  
    print ("fibonacci sequence dari pilihan anda adalah:")  
    for count in range(n_terms):  
        if count == n_terms-1:
            print(n_1)
        else:
            print(n_1,end=',')
        nth = n_1 + n_2  
       # Terakhir, update values  
        n_1 = n_2
        n_2 = nth