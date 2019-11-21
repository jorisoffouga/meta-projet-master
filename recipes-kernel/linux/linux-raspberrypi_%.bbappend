FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://defconfig \
    file://0001-drivers-iio-chemical-add-of_match_table-for-ccs811.patch \
    file://0002-arch-dts-bcm2710-rpi-b-plus-Add-bme-and-ccs811-i2c-n.patch \
    file://0003-arm-dts-bcm27100-rpi-3-b-plus-Add-74hc595-spi-entry-.patch \
"
