DESCRIPTION = "The "mro" namespace provides several utilities for dealing with method \
resolution order and method caching in general in Perl 5.9.5 and higher."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MRO-Compat"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/MRO-Compat-0.13.tar.gz"

SRC_URI[md5sum] = "d2e603e8ae9dc6934162d190eb085385"
SRC_URI[sha256sum] = "8a2c3b6ccc19328d5579d02a7d91285e2afd85d801f49d423a8eb16f323da4f8"

S = "${WORKDIR}/MRO-Compat-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
