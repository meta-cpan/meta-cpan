DESCRIPTION = "This module works around two historical bugs in Perl's handling of the \
"%^H" (lexical hints) variable. One bug causes lexical state in one file to \
leak into another that is "require"d/"use"d from it. This bug, [perl #68590] \
, was present from Perl 5.6 up to Perl 5.10, fixed in Perl 5.11.0. \
The second bug causes lexical state (normally a blank "%^H" once the first \
bug is fixed) to leak outwards from "utf8.pm", if it is automatically \
loaded during Unicode regular expression matching, into whatever source is \
compiling at the time of the regexp match. This bug, [perl #73174], was \
present from Perl 5.8.7 up to Perl 5.11.5, fixed in Perl 5.12.0."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Lexical-SealRequireHints"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Lexical-SealRequireHints-0.011.tar.gz"

SRC_URI[md5sum] = "210635d5316693885eb328986ef8e1d8"
SRC_URI[sha256sum] = "9e918ed118ef685d6e09dab1cd6e66ee0a31d776fe24bba63e5243906f56013a"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Lexical-SealRequireHints-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
