DESCRIPTION = "This module is a dropin replacement for File::ShareDir. It supports the \
"dist_dir" and "dist_file" functions, except these functions have been \
enhanced to understand when the developer's local "./share/" directory \
should be used."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Share"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/File-Share-0.25.tar.gz"

SRC_URI[md5sum] = "214cb8d14627cbff13e0a6de3ac18bb0"
SRC_URI[sha256sum] = "8e9d256e0ac4384228384b4ad2a57819a163edb39f20988ed5c1318c01407070"
RDEPENDS:${PN} += "file-sharedir-perl"

S = "${WORKDIR}/File-Share-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
