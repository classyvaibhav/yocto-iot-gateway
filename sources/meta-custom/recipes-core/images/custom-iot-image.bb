DESCRIPTION = "Custom IoT Gateway Image with OTA Support"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "empty-root-password ssh-server-dropbear serial-autologin-root"

IMAGE_INSTALL += " \
    bash \
    busybox \
    initscripts \
    swupdate \
    swupdate-www \
    mtd-utils \
"

IMAGE_INSTALL:remove = "perl"

APPEND += "quiet loglevel=3"
SERIAL_CONSOLES = "115200;ttyS0"

