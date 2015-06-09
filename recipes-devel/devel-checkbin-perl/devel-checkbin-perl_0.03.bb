DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular \
command is available."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-CheckBin"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Devel-CheckBin-0.03.tar.gz"

SRC_URI[md5sum] = "fa82f7d34e9f751927411b993d8ffa87"
SRC_URI[sha256sum] = "d44330f6199c5ddb0a4f0654fc52f5d82282e37c4e42f049464dfbf2ee9d1f75"
RDEPENDS_${PN} += "perl"
DEPENDS += "perl"

S = "${WORKDIR}/Devel-CheckBin-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
