DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Growl-GNTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MATTN/Growl-GNTP-0.20.tar.gz"

SRC_URI[md5sum] = "482e242fc8d274d1138c361200e0b65d"
SRC_URI[sha256sum] = "b1c9795b72c750ca6bb69cfa7e50e78e429a8e1972d7cb9ed7ee1ec769311d94"
RDEPENDS_${PN} += "crypt-cbc-perl"
RDEPENDS_${PN} += "data-uuid-perl"
RDEPENDS_${PN} += "io-socket-portstate-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Growl-GNTP-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
