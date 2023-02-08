DESCRIPTION = "This module is a helper for easily find configuration file locations. \
Whether to use this information for find a suitable place for installing \
them or looking around for finding any piece of settings, heavily depends \
on the requirements."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-File-ConfigDir-0.008.tar.gz"

SRC_URI[md5sum] = "7b1ed222a93e29b6ea83981c0fdc7d61"
SRC_URI[sha256sum] = "f8d41145e8f865c85b4b0823f194cdf3ae228bbec7dcf828432dcd2f6d1c03ac"
RDEPENDS:${PN} += "file-configdir-perl"
RDEPENDS:${PN} += "moo-perl"

S = "${WORKDIR}/MooX-File-ConfigDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
