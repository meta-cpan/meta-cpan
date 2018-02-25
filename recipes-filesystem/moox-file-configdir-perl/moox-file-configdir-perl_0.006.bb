DESCRIPTION = "This module is a helper for easily find configuration file locations. \
Whether to use this information for find a suitable place for installing \
them or looking around for finding any piece of settings, heavily depends \
on the requirements."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-File-ConfigDir-0.006.tar.gz"

SRC_URI[md5sum] = "11ccd7b1223ec62d85e3651f80138040"
SRC_URI[sha256sum] = "7d9ecd9687867ad4216509dd4e198716ec5dc0818fff61dcabfe0833b0460039"
RDEPENDS_${PN} += "file-configdir-perl"
RDEPENDS_${PN} += "moo-perl"

S = "${WORKDIR}/MooX-File-ConfigDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
