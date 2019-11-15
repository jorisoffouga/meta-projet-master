FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
	file://wifi.network \
	file://ethernet.network \
"

do_install_append() {
	install -Dm 0644 ${WORKDIR}/wifi.network ${D}${sysconfdir}/systemd/network/wifi.network
	install -Dm 0644 ${WORKDIR}/ethernet.network ${D}${sysconfdir}/systemd/network/ethernet.network
}
