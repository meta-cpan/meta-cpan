DESCRIPTION = "This module is a thin wrapper for JSON::XS-compatible modules with a few \
additional features. All the backend modules convert a Perl data structure \
to a JSON text and vice versa. This module uses JSON::XS by default, and \
when JSON::XS is not available, falls back on JSON::PP, which is in the \
Perl core since 5.14. If JSON::PP is not available either, this module then \
falls back on JSON::backportPP (which is actually JSON::PP in a different \
.pm file) bundled in the same distribution as this module. You can also \
explicitly specify to use Cpanel::JSON::XS, a fork of JSON::XS by Reini \
Urban."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/JSON-4.04.tar.gz"

SRC_URI[md5sum] = "4623b908d3dd5a190180def02a4b94b3"
SRC_URI[sha256sum] = "66b6c6ea1ed6d609b0b70df29fdcbd281f3fe13c661e5b2847b4e4e8c12b5380"

S = "${WORKDIR}/JSON-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
