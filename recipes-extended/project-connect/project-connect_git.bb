LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e11ece3f15c3b71fa0ebf52dac332dc1"

SRC_URI = "git://github.com/jorisoffouga/project_connect;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "531dd94d22b8af83d0837f1c73c492ea0ac341dd"

S = "${WORKDIR}/git"

DEPENDS = "qtbase qtmqtt libgpiod"

inherit qmake5 systemd


FILES_${PN} = " \
  /opt/flameGraph/bin/flameGraph \
  /opt/mqtthandler/bin/ \
  /opt/airquality/bin/airquality \
  /opt/environmental/bin/environmental \
  /opt/gateway/bin/gateway \
  /lib/systemd/system/ \
"
