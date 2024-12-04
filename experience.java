// Ambil semua elemen gallery-item
const galleryItems = document.querySelectorAll('.gallery-item');

galleryItems.forEach(item => {
    item.addEventListener('click', function() {
        // Reset semua gambar dan caption
        galleryItems.forEach(el => {
            el.classList.remove('active');
            el.querySelector('.caption').classList.remove('show');
        });
        
        // Toggle kelas untuk gambar yang diklik
        const caption = this.querySelector('.caption');
        this.classList.add('active');
        caption.classList.add('show');
    });
});
