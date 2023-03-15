DESCRIPTION = "caller_cv($level)     "caller_cv" gives you the coderef of the subroutine \
being invoked at the call frame indicated by the value of $level"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Caller"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Devel-Caller-2.06.tar.gz"

SRC_URI[md5sum] = "af52f47979b3c9358af9e5d8c283f263"
SRC_URI[sha256sum] = "6a73ae6a292834255b90da9409205425305fcfe994b148dcb6d2d6ef628db7df"
RDEPENDS:${PN} += "padwalker-perl"

S = "${WORKDIR}/Devel-Caller-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
