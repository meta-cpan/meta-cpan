DESCRIPTION = "This module tries to make install path resolution as easy as possible."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-InstallPaths"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-0.012.tar.gz"

SRC_URI[md5sum] = "9a8d66aab1ffec98ea260faf03ac612b"
SRC_URI[sha256sum] = "84735e3037bab1fdffa3c2508567ad412a785c91599db3c12593a50a1dd434ed"
RDEPENDS_${PN} += "extutils-config-perl"

S = "${WORKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
