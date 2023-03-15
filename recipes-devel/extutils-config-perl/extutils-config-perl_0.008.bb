DESCRIPTION = "ExtUtils::Config is an abstraction around the %Config hash. By itself it is \
not a particularly interesting module by any measure, however it ties \
together a family of modern toolchain modules."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Config"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Config-0.008.tar.gz"

SRC_URI[md5sum] = "565a7b09c7cac5907a25bbe2c959a717"
SRC_URI[sha256sum] = "ae5104f634650dce8a79b7ed13fb59d67a39c213a6776cfdaa3ee749e62f1a8c"

S = "${WORKDIR}/ExtUtils-Config-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
