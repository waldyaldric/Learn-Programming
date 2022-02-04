print("selamat Datang di ATM BRI")
print("pilih option :")
print("1. Check Uang")
print("2. Ambil Uang")
print("3. Setor Tunai")
option=int(input("Silakan pilih option :"))
if option==1:
    print("Uang Kamu berjumlah Rp.100.000.000")
elif option==2:
    print("Uang Kamu berjumlah Rp.100.000.000, Mau ambil berapa?")
    print("1. print Rp.1.000.000")
    print("2. 100.000.000")
    Uang_Kamu = 100000000
    option2=int(input("option:"))
    if option2==1:
        hasil=Uang_Kamu-1000000
        print("Uan-g kamu sekarang berjumlah :",hasil)
    elif option2==2:
         hasil2=Uang_Kamu-100000000
         print("Uang Kamu sekarang berjumlah :",hasil2)
    else:
        print("keyword anda salah!")
elif option==3:
        Uang_Kamu=100000000
        print("Uang kamu sekarang berjumlah Rp.100.000.000, Mau setor tunai berapa?")
        option3=int(input("Masukan jumlah Uang :"))
        hasil3=Uang_Kamu+option3
        print("Jumlah Uang kamu sekarang adalah :",hasil3)
else:
        print("keyword anda salah, Mohon coba lagi :")        