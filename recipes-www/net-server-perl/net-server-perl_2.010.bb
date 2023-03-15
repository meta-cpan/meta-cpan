DESCRIPTION = ""Net::Server" is an extensible, generic Perl server engine."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RH/RHANDOM/Net-Server-2.010.tar.gz"

SRC_URI[md5sum] = "d97171b4b2f0ebfea1d5fa03207eaaf6"
SRC_URI[sha256sum] = "95fc380abc32eaef84406ecc4b01612c7215f6375318fdb95901be1babd1a6e1"

S = "${WORKDIR}/Net-Server-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
