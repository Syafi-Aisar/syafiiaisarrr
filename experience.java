const galleryItems = document.querySelectorAll('.gallery-item');

galleryItems.forEach(item => {
    item.addEventListener('click', function() {
   
        galleryItems.forEach(el => {
            el.classList.remove('active');
            el.querySelector('.caption').classList.remove('show');
        });
        
        const caption = this.querySelector('.caption');
        this.classList.add('active');
        caption.classList.add('show');
    });
});
