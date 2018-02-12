DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS is \
already loaded, in which case it uses that module. Otherwise it tries to \
load Cpanel::JSON::XS, then JSON::XS, then JSON::PP in order, and either \
uses the first module it finds or throws an error."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON-MaybeXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/JSON-MaybeXS-1.003010.tar.gz"

SRC_URI[md5sum] = "dee87855efd96e8599b9439e97f538ff"
SRC_URI[sha256sum] = "60ac9aa33c7d5cbccc308f864a84a7612afdfcda79ac930ddd42e95f3a014543"

S = "${WORKDIR}/JSON-MaybeXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
