DESCRIPTION = "An \"HTTP::Message\" object contains some headers and a content body. \
The following methods are available:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/HTTP-Message-6.10.tar.gz"

SRC_URI[md5sum] = "b8a68ce1898691c536714eeae3f963d4"
SRC_URI[sha256sum] = "bd990d3ce6545b8499ca69790847e248cf402614b48f975f8d2ef48cb8cf4c68"

RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "io-compress-perl"
RDEPENDS_${PN} += "io-html-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "uri-perl"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
