print(
"""
SELAMAT DATANG DI KALKULATOR SEDERHANA
PEINTAH MATEMATIKA YANG DAPAT DIMASUKAN ADALAH SEBAGAI BERIKUT
PENJJUMLAHAN = +
PENGUEANGAN = -
PERKALIHAN = *
PEMBAGIAN = /
KELUARAN PROGRAM = exit() 
"""
)

while True:

    try:
        masukanperintah = eval (input("Masukan perintah: "))
        print(f"hasil : {masukanperintah}" )
    except Exception as e:
            print("MASUKAN HARUS BERAPA ANGKA DAN OPERASI MATEMATIKA, DAN ANGKA TIDAK BISA DIBAGI DENGAN 0!!!") 
