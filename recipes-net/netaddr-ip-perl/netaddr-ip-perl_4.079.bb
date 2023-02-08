DESCRIPTION = "This module provides an object-oriented abstraction on top of IP addresses \
or IP subnets that allows for easy manipulations. Version 4.xx of \
NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/NetAddr-IP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c \
"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKER/NetAddr-IP-4.079.tar.gz"

SRC_URI[md5sum] = "990dfcbffae356835c536e8ab56a2880"
SRC_URI[sha256sum] = "ec5a82dfb7028bcd28bb3d569f95d87dd4166cc19867f2184ed3a59f6d6ca0e7"

S = "${WORKDIR}/NetAddr-IP-${PV}"

# running configure in Lite/Util will fail ...
EXTRA_CPANFLAGS = "-noxs"

inherit cpan allarch

BBCLASSEXTEND = "native"
