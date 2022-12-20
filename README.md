# FP_Hunter_PBO_C

Anggota Kelompok :
1. Ilham Insan Wafi       (5025211255)
2. Yusna Millaturrosyidah (5025211254)

# Lost Pet
Lost Pet adalah sebuah game java 2 dimensi yang boleh dibilang secara tampilan mirip dengan RPG. Game ini mempunyai alur seseorang yang sedang mencari hewan peliharaannya yang hilang dan tidak ada di kandangnya. Namun, beberapa hewan peliharaan yang ia cari ada yang terkunci di beberapa tempat. Oleh karena itu, dia juga harus mencari kunci  untuk membuka ruangannya. Satu kunci hanya bisa dipakai untuk membuka satu ruangan. Player harus menemukan dahulu hewan peliharaan dengan jumlah yang telah ditentukan supaya dapat membuka pintu yang menuju ke kandang hewan dan mengembalikannya. Apabila di tengah jalan player menabrak monster maka hearthealth player akan berkurang. Setelah terkumpul semua hewan peliharaannya, player dapat langsung membuka pintu kandang dan mengembalikan hewan peliharaannya.

Penjelasan Class yang dibuat :
1. Class Entity : Parent Class yang berisi entitas-entitas yang ada pada Player dan Monster
2. Class Monster : Class yang secara khusus dibuat untuk mengatur monster dalam game
3. Class Player : Class yang secara khusus dibuat untuk mengatur player dalam game
4. Class SuperObject : Class parent yang digunakan untuk menyimpan dan mengatur segala entitas yang dimiliki object. Child dari class ini berupa class-class untuk mengatur setiap object yang ada pada game. 
5. Class Main : Fungsi Utama, didalamnya kita membuat dan sedikit mengatur window, memberikan judul project, memanggil method dari class lain yang berfungsi untuk menjalankan game.
6. Class Game Panel : Class untuk mengatur layar permainan
7. Class AssetSetter : Class untuk mengatur posisi setiap object dan monster pada game
8. Class CollisionChecker : Class untuk mengatur interaksi setiap object dan player dalam game.
9. Class KeyHandler : Class untuk mengatur input keyboard yang menjadi informasi bagi game dalam beberapa kondisi.
10. Class Sound : Untuk mengatur backsound dan sound effect yang digunakan dalam game.
11. Class UI : Mengatur tampilan UI pada game di semua kondisi pada game.
12. Class UtilityTool : Mengatur gambar yang dimasukkan ke dalam game
13. Class TileManager : Untuk mengatur map Game


Referensi :
https://www.youtube.com/watch?v=om59cwR7psI&list=PL_QPQmz5C6WUF-pOQDsbsKbaBZqXj4qSq
