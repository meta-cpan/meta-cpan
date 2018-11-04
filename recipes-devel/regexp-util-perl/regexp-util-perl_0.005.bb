DESCRIPTION = "This module provides the following functions:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Regexp-Util"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Regexp-Util-0.005.tar.gz"

SRC_URI[md5sum] = "8fd3e4adabcfe44b5c3fba28b1d10168"
SRC_URI[sha256sum] = "a08871fca2054c464ec6cd663fbdb2fce99cc0346256acf0a4936681ed8a0e00"
RDEPENDS_${PN} += "exporter-tiny-perl"

S = "${WORKDIR}/Regexp-Util-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
